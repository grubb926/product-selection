angular.
    module("productSelectionApp").
        service('productService', function() {
            var productList = [];

            var setProducts = function(newObj) {
                productList =  newObj;
            };

            var getProducts = function(){
                return productList;
            };

            return {
              setProducts: setProducts,
              getProducts: getProducts
            };

          });