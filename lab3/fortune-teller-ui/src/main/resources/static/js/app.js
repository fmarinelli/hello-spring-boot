angular.module('fortunes', ['ngRoute']).config(function ($routeProvider) {

    $routeProvider.when('/', {
        templateUrl: 'fortune.html',
        controller: 'fortune'
    })

}).controller('fortune', ['$scope', '$http', '$log', function ($scope, $http, $log) {

    $http
        .get('/random')
        .then(function (response) {
            $scope.fortune = response.data;
        });

}]);