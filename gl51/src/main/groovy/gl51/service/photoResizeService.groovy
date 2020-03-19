package gl51.service

import gl51.data.Photo


/**
 * Ceci redimensionne les images
 */
interface photoResizeService {

    /**
     * Ceci redimensionne la photo selon les paramètres de hauteur et largeur
     * @param width
     * @param height
     * @return resized photo
     */
    Photo resizePhoto(int width, int height)

}