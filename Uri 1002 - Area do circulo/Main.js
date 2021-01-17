//@Author Diego Lins

var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var r = parseFloat(lines.shift());
var pi = 3.14159;
var a = pi * (Math.pow(r,2));
console.log("A=" + a.toFixed(4));