let botaoAtualizar = document.getElementById('atualizar-saldo');
let botaoLimpar = document.getElementById('limpar-saldo');
let soma = document.getElementById('soma') as HTMLInputElement;
let campoSaldo = document.getElementById('campo-saldo');

let totalBalance: number = 0;

function somarAoSaldo(soma: number) {
    if(campoSaldo){
        totalBalance += soma;
        campoSaldo.innerHTML = totalBalance.toString();
        restoreFillField();
    } 
}

function restoreFillField(){
    if(Number(soma.value) !== 0){
        soma.value = '';
    }  
}

function limparSaldo() {
    if(campoSaldo){
        totalBalance = 0;
        campoSaldo.innerHTML = totalBalance.toString();
    }
}

if(botaoAtualizar){
    botaoAtualizar.addEventListener('click', function () {
        if(soma){
        somarAoSaldo(Number(soma.value));
        }
    });
    
}

if(botaoLimpar){
    botaoLimpar.addEventListener('click', function () {
        limparSaldo();
    });
}

