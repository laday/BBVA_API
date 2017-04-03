/**
 * Created by lday15 on 3/29/2017.
 */
/**
 *
 */

var controllersModule = angular.module('controllers', []);

controllersModule.controller('SampleController', function($scope) {
    console.log('Sample Load done !');
});

controllersModule.controller('ajaxController', function($scope, $http) {
    $http.get('/AngularSpring/rest/alldata').success(function(data) {
        console.log(data);
    });
});