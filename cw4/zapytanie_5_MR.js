var map = function() {
    if (this.nationality !== "Poland" || this.sex !== "Female")
        return;
    
    for (var i = 0; i < this.credit.length; i++)
        emit(this.credit[i].currency, parseFloat(this.credit[i].balance));
};

var reduce = function(key, values) {
    var sum = 0;
    for (var i = 0; i < values.length; i++) sum += values[i];
    return { summed_balance: sum, avg_balance: sum / values.length };
};

db.people.mapReduce(map, reduce, { out: 'poeple_female_pol_currency_remainings' });
printjson(db.poeple_female_pol_currency_remainings.find({}).toArray())