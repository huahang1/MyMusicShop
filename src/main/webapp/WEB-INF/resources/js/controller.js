var cartApp = angular.module("cartApp",[]);

cartApp.controller('cartCtrl',function($scope,$http){
    
    $scope.refershCart = function (cartId) {
        $http.get('/eMusicStore/rest/cart/' + $scope.cartId).success(function (data) {
                $scope.cart = data;
            });
    };

    $scope.clearCart = function () {
        $http.delete('/eMusicStore/rest/cart/' + $scope.cartId).success($scope.refershCart($scope.cartId));
    };

    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        $scope.refershCart(cartId);
    };

    $scope.addToCart = function (productId) {
        //if we don't put the slash at the beginning, the url will be concat after the root url
        $http.put('/eMusicStore/rest/cart/add/' + productId).success(function (data) {
            $scope.refershCart($http.get('/eMusicStore/rest/cart/cartId'));
            alert("product successfully added to the cart");
        });
    };
    
    $scope.removeFromCart = function (productId) {

        $http.put('/eMuiscStore/rest/cart/remove/'+ productId).success(function (data) {

           $scope.refershCart($http.get('/eMusicStore/rest/cart/cartId'));
            alert('remove successfully');
        })
    };
});