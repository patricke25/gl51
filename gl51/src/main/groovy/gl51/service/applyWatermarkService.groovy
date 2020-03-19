package gl51.service

import gl51.data.Photo
import gl51.data.Watermark

interface applyWatermarkService {

    Watermark applyWatermark(Photo photo)

}