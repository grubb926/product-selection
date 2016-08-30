angular.module("productSelectionApp").controller("ProductSelectionController", ProductSelectionController);

function ProductSelectionController($http, $location, $cookies){
    var viewModel = this;

    viewModel.fetchProductList = function () {
        $http.get('/product-selection/products.json').success(function(productList){
            viewModel.products = productList;
        });
    };

    viewModel.confirmProducts = function () {
        $location.path('/product-selection/checkout');
    }

    viewModel.products = viewModel.fetchProductList();

    viewModel.selectedProducts = [];

    viewModel.customerId = $cookies.get('customerId');

    viewModel.toggleSelection = function(product) {
         var index = viewModel.selectedProducts.indexOf(product);

         if (index > -1) {
           viewModel.selectedProducts.splice(index, 1);
         }

         else {
           viewModel.selectedProducts.push(product);
         }
    };
}