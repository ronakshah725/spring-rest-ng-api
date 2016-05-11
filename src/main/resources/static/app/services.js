(function(angular) {
  var VehicleFactory = function($resource) {
    return $resource('/vehicles/:id', {
      id: '@id'
    }, {
      update: {
        method: "PUT"
      },
      remove: {
        method: "DELETE"
      }
    });
  };
  
  VehicleFactory.$inject = ['$resource'];
  angular.module("myApp.services").factory("Vehicle", VehicleFactory);
}(angular));