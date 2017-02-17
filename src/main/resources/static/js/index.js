import R from 'ramda';
import 'spectre.css';
import 'font-awesome/css/font-awesome.css';

function component() {
    var element = document.createElement('div');

    /* lodash is required for the next line to work */
    element.innerHTML = _.join(['Hello', 'webpack'], ' ');

    return element;
}
console.log(R.add(1, 2));
document.body.appendChild(component());

