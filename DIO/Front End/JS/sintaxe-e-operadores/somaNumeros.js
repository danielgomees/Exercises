const prompt = require("prompt-sync")({ sigint: true });
var num1 = prompt("Insira o primeiro número: ");
var num2 = prompt("Insira o segundo número: ");

console.log(comparaNumeros() + confereSoma());

function comparaNumeros(primeiro, segundo) {
    primeiro = parseInt(num1);
    segundo = parseInt(num2);

    if (primeiro == segundo) {
        return "Os números " + primeiro + " e " + segundo + " são iguais. "
    } else {
        return "Os números " + primeiro + " e " + segundo + " não são iguais. "
    }
}

function confereSoma(primeiro, segundo) {
    primeiro = parseInt(num1);
    segundo = parseInt(num2);
    const soma = primeiro + segundo;

    if (soma > 10) {
        if (soma > 20) {
            return "Sua soma é "+ soma + ", que é maior que 10 e maior que 20.";
        } else {
            return "Sua soma é "+ soma + ", que é maior que 10 e menor que 20.";
        }
    } else {
        return "Sua soma é "+ soma + ", que é menor que 10 e menor que 20.";
    }
}