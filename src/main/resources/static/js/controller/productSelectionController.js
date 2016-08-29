angular.module("productSelectionApp").controller("ProductSelectionController", ProductSelectionController);

function ProductSelectionController(){
    var vm = this;
    vm.products = [
        {"name":"Arsenal TV", "category":"Sports", "location":"LONDON"},
        {"name":"Chelsea TV", "category":"Sports", "location":"LONDON"},
        {"name":"Liverpool TV", "category":"Sports", "location":"LIVERPOOL"},
        {"name":"Sky News", "category":"News", "location":""},
        {"name":"Sky Sports News", "category":"News", "location":""}
    ]

    vm.selectedProducts = [];

    vm.toggleSelection = function(product) {
         var index = vm.selectedProducts.indexOf(product);

         if (index > -1) {
           vm.selectedProducts.splice(index, 1);
         }

         else {
           vm.selectedProducts.push(product);
         }
    };


}

