"use strict";
// Como podemos rodar isso em um arquivo .ts sem causar erros? 
// let employee = {};
// employee.code = 10;
// employee.name = "John";
let employee = {
    code: 10,
    name: "john"
};
function printInformations(emp) {
    if (employee) {
        console.log(`Name: ${emp.name}, code: ${emp.code}`);
    }
}
printInformations(employee);
