//printjson(db.people.updateMany({location:{city: "Moscow"}}, { $set : {location:{ city: "Moskwa"}}}))
//$rename
printjson(db.people.updateMany({'location.city': "Moscow"}, { $set : {'location:city': "Moskwa"}}))