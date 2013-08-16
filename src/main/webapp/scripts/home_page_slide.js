$(function() {
	$('#introduction_images').crossSlide({
		fade: 1
	},
	[

//	

	{
		src:  'images/introduction_frames/pic01.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},
	{
		src:  'images/introduction_frames/red_mosaic_bgr.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.1
	},
	{
		src:  'images/home/pic01.jpg',
		from: '50% 50% 1x',
		to:   '50% 50% 1x',
		time: 2
	},
	{
		src:  'images/introduction_frames/red_mosaic_bgr.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},
	{
		src:  'images/introduction_frames/pic01.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},

//	

	{
		src:  'images/home/pic02.jpg',
	//	alt:  'Early Years: Hasib Sabbagh & Said Khoury',
		from: '50% 0% 1.5x',
		to:   '100% 100% 1x',
		time: 4
	},
	{
		src:  'images/introduction_frames/pic01.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},
	{
		src:  'images/home/pic03.jpg',
	//	alt:  'Hasib Sabbagh',
		from: '0% 10% 1.3x',
		to:   '100% 60% 1x',
		time: 3
	},
	{
		src:  'images/introduction_frames/pic01.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},
	{
		src:  'images/home/pic04.jpg',
	//	alt:  'Said Khoury',
		from: '100% 30% 1.3x',
		to:   '100% 70% 1x',
		time: 3
	},
	{
		src:  'images/introduction_frames/pic01.jpg',
		from: '100% 100% 1x',
		to:   '100% 100% 1x',
		time: 0.05
	},
	{
		src:  'images/home/pic05.jpg',
		from: '50% 0% 1.2x',
		to:   '50% 50% 1x',
		time: 3
	}

//

	], function(idx, img, idxOut, imgOut) {
		if (idxOut == undefined)
	{
		// starting single image phase, put up caption
		$('#introduction_images_caption').text(img.alt).animate({ opacity: .8 })
	}
	else
	{
		// starting cross-fade phase, take out caption
		$('#introduction_images_caption').animate({ opacity: 0 })
	}
	$('#introduction_images_caption').show().css({ opacity: 0 });
	
	});
});