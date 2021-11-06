/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function generatePagger(div, pageindex, totalpage, gap) {
    var container = document.getElementById(div);
    if (pageindex - gap > 1) {
        container.innerHTML += '<a href="home?page=1#menu">First</a>';
    }

    for (var i = pageindex - gap; i < pageindex; i++) {
        if (i > 0) {
            container.innerHTML += '<a href="home?page=' + i + '#menu">' + i + '</a>';
        }
    }

    container.innerHTML += '<a href="#menu" class="target">' + pageindex + '</a>';

    for (var i = pageindex + 1; i < pageindex + gap; i++) {
        if (i <= totalpage) {
            container.innerHTML += '<a href="home?page=' + i + '#menu">' + i + '</a>';
        }
    }

    if (pageindex + gap < totalpage) {
        container.innerHTML += '<a href="home?page=' + totalpage + '#menu">Last</a>';
    }
}
