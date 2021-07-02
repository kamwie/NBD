printjson(db.people.insert({
    sex : "Male",
    first_name : "Kamil",
    last_name : "Wiewior",
    job : "Transport and Logistics",
    email : "wiewior.kamil@gmail.com",
    location: {
        city : "Warsaw",
        address: {
            streetname : "Łagodna",
            streetnumber : "1"
            },
        },
    description: "blablablaba super jest NBD trzeba bylo zrobic wczesniej",
    height: "190",
    weight:"90",
    birth_date:"1992-01-01T00:00:00Z",
    nationality:"Poland",
    credit: [
        {
            type : "maestro",
            number : "5007660999443305",
            currency : "EUR",
            balance : "99999999",
            },
        ]
    }))