package gl51.service

import gl51.data.Cloud
import gl51.data.Photo

/**
 * Ceci update le cloud
 */

interface cloudUpdateService {

    /**
     *  Ceci update le cloud avec les 2 photos générées
     * @param Cloud,
     * @param Photo (grande taille)
     * @param Photo (thumbnail + watermark)
     * @return true si l'update est effectué
     */

    boolean updateCloud(Cloud cloud, Photo photo, Photo thumbnail)

}