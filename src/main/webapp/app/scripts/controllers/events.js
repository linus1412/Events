'use strict';

angular.module('webappApp')
  .controller('EventsCtrl', function ($scope, $resource) {

        var Event = $resource('/Events/rest/events/:id');
        $scope.eventData = {};

        $scope.id = null;

        $scope.findEvent = function() {
            $scope.eventData = Event.get({id : $scope.id});
        }

        $scope.dateAsDate = new Date($scope.eventData.date);

  });
