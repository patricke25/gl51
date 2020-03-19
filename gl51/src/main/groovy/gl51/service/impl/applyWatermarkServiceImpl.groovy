package gl51.service.impl

import gl51.data.Photo
import gl51.data.Watermark
import gl51.service.applyWatermarkService
import gl51.service.photoService

import javax.inject.Inject

class applyWatermarkServiceImpl implements applyWatermarkService {

    @Inject
    photoService photoService

    @Override
    Watermark applyWatermark(Photo photo) {
        return null
    }
}
