(function(angular) {
  angular.module("myApp.controllers", []);
  angular.module("myApp.services", []);
  angular.module("myApp", ["ngResource", "xeditable", "myApp.controllers", "myApp.services"]);
}(angular));