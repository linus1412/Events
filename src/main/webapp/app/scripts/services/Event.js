'use strict';

angular.module('webappApp')
  .service('Event', function Event() {
    return { get : function() {
        return { id : 'abc', date : new Date()};
    }
    };
  }); 
