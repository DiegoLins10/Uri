//@Author Diego Lins
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var a = parseInt(lines.shift());
var b = parseInt(lines.shift());
var soma = a + b;
console.log("SOMA = " + soma);