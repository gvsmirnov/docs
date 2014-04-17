(function(){
    var steps = $(".step");
    var totalSteps = 0;
    steps.each(
        function(i, element) {
            element = $(element);
            element.data("step-number", ++totalSteps);
        }
    );

    $("#total-slides").text(totalSteps);

})();

var updateCurrentSlide = function(element) {
    var slideNumber = element.data("step-number");
    $("#current-slide-number").text(slideNumber);
}