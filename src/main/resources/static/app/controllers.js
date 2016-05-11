(function(angular) {
  var AppController = function($scope, Vehicle) {
    Vehicle.query(function(response) {
      
      // // model for bs-table
      // $scope.contactList = [];

      // // get contact list
      // $scope.contactList = SomeService.GetAll();

      $scope.vehicles = response ? response : [];
    });
    
    $scope.addVehicle = function(year,make, model) {
      new Vehicle({
        year: year,
        make: make,
        model: model

      }).$save(function(vehicle) {
        $scope.vehicles.push(vehicle);
      });
      $scope.newYear = "";
      $scope.newMake = "";
      $scope.newModel = "";
    };
    
    $scope.updateVehicle = function(vehicle) {
      vehicle.$update();
    };
    
    $scope.deleteVehicle = function(vehicle) {
      vehicle.$remove(function() {
        $scope.vehicles.splice($scope.vehicles.indexOf(vehicle), 1);
      });
    };
  };
  
  AppController.$inject = ['$scope', 'Vehicle'];
  angular.module("myApp.controllers").controller("AppController", AppController);
}(angular));