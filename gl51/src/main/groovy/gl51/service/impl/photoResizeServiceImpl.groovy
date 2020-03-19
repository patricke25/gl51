package gl51.service.impl

import gl51.data.Photo
import gl51.service.photoResizeService
import gl51.service.photoService

import javax.inject.Inject

class photoResizeServiceImpl implements photoResizeService {

    @Inject
    photoService photoService


    @Override
    Photo resizePhoto(int width, int height) {
        Photo photo = photoService.fetchPhoto()
    }
}