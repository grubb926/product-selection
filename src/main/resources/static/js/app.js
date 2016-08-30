angular.
    module('productSelectionApp', ['ngCookies', 'ngRoute']).
        config(['$routeProvider', '$locationProvider',
            function($routeProvider, $locationProvider) {
                $routeProvider.
                    when('/product-selection/products',{
                        templateUrl: '/product-selection/view/products.html',
                        controller: 'ProductSelectionController',
                        controllerAs: 'controller'
                    }).
                    when('/product-selection/checkout',{
                        templateUrl: '/product-selection/view/checkout.html',
                        controller: 'ProductSelectionController',
                        controllerAs: 'controller'
                    });
                $locationProvider.html5Mode(true);
            }]);


