const images = [
    "image/image1.jpg",
    "image/image2.jpg",
    "image/image3.jpg",
    "image/image4.jpg",
];

let currentIndex = 0; 
const sliderImage = document.getElementById("sliderImage");

function updateImage() {
sliderImage.src = images[currentIndex];
}

updateImage();

function nextImage() {
currentIndex = (currentIndex + 1) % images.length;
updateImage();
}

function prevImage() {
currentIndex = (currentIndex - 1 + images.length) % images.length;
updateImage();
}