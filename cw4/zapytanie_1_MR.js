var map = function() {
    var weight = this.weight;
    var height = this.height;
    
    if (weight === null) weight = 0;
    if (height === null) height = 0;
    
    emit(this.sex, { height: height, weight: weight });
};

var reduce = function(key, values) {
    var heightSum = 0,
        weightSum = 0,
        avgHeight = 0,
        avgWeight = 0;
    
    for (var i = 0; i < values.length; i++) {
        heightSum += values[i].height;
        weightSum += values[i].weight;
    }
    
    avgHeight = heightSum / values.length;
    avgWeight = weightSum / values.length;
    
    
    return { height: avgHeight, weight: avgWeight };
};

db.people.mapReduce(map, reduce, { out: 'people_avg_width_height' });
printjson(db.people_avg_width_height.find({}).toArray())