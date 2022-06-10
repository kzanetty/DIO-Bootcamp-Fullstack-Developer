// Como podemos rodar isso em um arquivo .ts sem causar erros? 
// let employee = {};
// employee.code = 10;
// employee.name = "John";

interface Employee {
    code: number,
    name: string
}

let employee: Employee = {
    code: 10,
    name: "john"
}

function printInformations(emp: Employee):void {
    if(employee){
        console.log(`Name: ${emp.name}, code: ${emp.code}`)
    }
}

printInformations(employee);