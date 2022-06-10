"use strict";
;
var Profession;
(function (Profession) {
    Profession[Profession["Actress"] = 0] = "Actress";
    Profession[Profession["Baker"] = 1] = "Baker";
})(Profession || (Profession = {}));
;
let pessoa1 = {
    name: "Maria",
    age: 29,
    profession: Profession.Actress
};
let pessoa2 = {
    name: "Roberto",
    age: 19,
    profession: Profession.Baker
};
let pessoa3 = {
    name: "Laura",
    age: 32,
    profession: Profession.Actress
};
let pessoa4 = {
    name: "Carlos",
    age: 19,
    profession: Profession.Baker
};
function printPeople(people) {
    if (people) {
        for (let ppe in people) {
            console.log(`Name: ${people[ppe].name}, age: ${people[ppe].age}, profession: ${people[ppe].profession}`);
        }
    }
}
printPeople([pessoa1, pessoa2, pessoa3, pessoa4]);
// Como podemos melhorar o esse código usando TS? 
// let pessoa1 = {};
// pessoa1.nome = "maria";
// pessoa1.idade = 29;
// pessoa1.profissao = "atriz"
// let pessoa2 = {}
// pessoa2.nome = "roberto";
// pessoa2.idade = 19;
// pessoa2.profissao = "Padeiro";
// let pessoa3 = {
//     nome: "laura",
//     idade: "32",
//     profissao: "Atriz"
// };
// let pessoa4 = {
//     nome = "carlos",
//     idade = 19,
//     profissao = "padeiro"
// }
