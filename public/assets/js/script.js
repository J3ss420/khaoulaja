var areaSpain = document.querySelector("#area-spain");
var capitalSpain = document.querySelector("#capital-spain");
var langaugeSpain = document.querySelector("#language-spain");
var currencySpain = document.querySelector("#currency-spain");
var areaGermany = document.querySelector("#area-germany");
var capitalGermany = document.querySelector("#capital-germany");
var languageGermany = document.querySelector("#language-germany");
var currencyGermany = document.querySelector("#currency-germany");
var areaFrance = document.querySelector("#area-france");
var capitalFrance = document.querySelector("#capital-france");
var languageFrance = document.querySelector("#language-france");
var currencyFrance = document.querySelector("#currency-france");
var areaItaly = document.querySelector("#area-italy");
var capitalItaly = document.querySelector("#capital-italy");
var languageItaly = document.querySelector("#language-italy");
var currencyItaly = document.querySelector("#currency-italy");
var areaNether = document.querySelector("#area-netherlands");
var capitalNether = document.querySelector("#capital-netherlands");
var languageNether = document.querySelector("#language-netherlands");
var currencyNether = document.querySelector("#currency-netherlands");

var apiUrl = "https://restcountries.com/v3.1/all"
var bpiUrl = "https://libretranslate.com/";

var getSpain = function () {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {

            var array = data[102].area;
            console.log(data);
            var cap = data[102].capital[0];
            console.log(cap);
            var diction = data[102].languages['spa'];
            console.log(diction);
            var money = data[102].currencies['EUR'].name;
            console.log(money);

            areaSpain.innerHTML = `${array}`;
            capitalSpain.innerHTML = `${cap}`;
            langaugeSpain.innerHTML = `${diction}`
            currencySpain.innerHTML = `${money}`

        });
};

var getGermany = function () {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {

            var array1 = data[174].area;
            console.log(array1)
            var cap1 = data[174].capital[0];
            var diction1 = data[174].languages['deu'];

            var money1 = data[174].currencies['EUR'].name;
            console.log(money1);

            areaGermany.innerHTML = `${array1}`;
            capitalGermany.innerHTML = `${cap1}`;
            languageGermany.innerHTML = `${diction1}`
            currencyGermany.innerHTML = `${money1}`

        });
};



var getFrance = function () {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {

            var array2 = data[120].area;
            console.log(array2)
            var cap2 = data[120].capital[0];
            var diction2 = data[120].languages['fra'];

            var money2 = data[120].currencies['EUR'].name;
            console.log(money2);

            areaFrance.innerHTML = `${array2}`;
            capitalFrance.innerHTML = `${cap2}`;
            languageFrance.innerHTML = `${diction2}`
            currencyFrance.innerHTML = `${money2}`

        });
};



var getItaly = function () {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {

            var array3 = data[65].area;
            console.log(array3)
            var cap3 = data[165].capital[0];
            var diction3 = data[165].languages['ita'];

            var money3 = data[165].currencies['EUR'].name;
            console.log(money3);

            areaItaly.innerHTML = `${array3}`;
            capitalItaly.innerHTML = `${cap3}`;
            languageItaly.innerHTML = `${diction3}`
            currencyItaly.innerHTML = `${money3}`

        });
};

var getNether = function () {
    fetch(apiUrl)
        .then(res => res.json())
        .then(data => {

            var array4 = data[241].area;
            console.log(array4)
            var cap4 = data[241].capital[0];
            var diction4 = data[241].languages['nld'];

            var money4 = data[241].currencies['EUR'].name;
            console.log(money4);

            areaNether.innerHTML = `${array4}`;
            capitalNether.innerHTML = `${cap4}`;
            languageNether.innerHTML = `${diction4}`
            currencyNether.innerHTML = `${money4}`

        });
};



var getTranslation = function () {
    fetch(bpiUrl)
        .then(res => res.json())
        .then(data => {
            console.log(data);
})
}

getSpain();
getGermany();
getFrance();
getItaly();
getNether();
getTranslation();
