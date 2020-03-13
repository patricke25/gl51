package gl51.service

import gl51.data.ip

/**
 * ceci convertit des IP en string
 */
interface IpConverterService {
    /**
     * convertit une IP en string
     * @param ip l'ip a convertir
     * @return
     */
    String getIpAndConvert(ip ip)
}
