
var map = function() {
    emit(this.job, null);
};

var reduce = function(key, values) {
    return null;
};

db.people.mapReduce(map, reduce, { out: 'distinct_jobs' });
printjson(db.distinct_jobs.find({}).toArray())