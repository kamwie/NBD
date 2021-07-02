printjson(db.people.aggregate({
    $unwind: "$credit"
}, {
    $group: {
        _id: "$credit.currency",
        "summed_balance": { "$sum":{$toDouble: "$credit.balance"} }
    }
}).toArray())