var velocityValue=document.getElementById("velocityValue");
var velocityLabel=document.getElementById("velocityLabel");

function getVelocityValue() {
    console.log("NEEE");
    writeVelocityToLabel(velocityValue.value);
}
function writeVelocityToLabel(velocity) {
    console.log("NEEE");
    velocityLabel.innerHTML=velocity;
}