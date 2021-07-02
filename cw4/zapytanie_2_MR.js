
var map = function() {
    for (var i = 0; i < this.credit.length; i++)
        emit(this.credit[i].currency, parseFloat(this.credit[i].balance));

};

var reduce = function(key, values) {
    var sum = 0;
    for (var i = 0; i < values.length; i++) sum += values[i];
    return sum;
};

db.people.mapReduce(map, reduce, { out: 'currency_remainings' });
printjson(db.currency_remainings.find({}).toArray())