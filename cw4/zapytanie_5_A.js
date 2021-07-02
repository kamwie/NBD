 printjson( 
db.people.aggregate([{
    $match: {
        sex: "Female",
        nationality: "Poland"
    }}, {
        $unwind: "$credit"
    }, {
        $group: {
        _id: "$credit.currency",
        "summed_balance": { "$sum": {$toDouble: "$credit.balance"} },
        "avg_balance": { "$avg": {$toDouble:"$credit.balance"} }
    }
}]).toArray())