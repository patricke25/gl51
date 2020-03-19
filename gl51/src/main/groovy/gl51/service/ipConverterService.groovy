package gl51.service

import gl51.data.Ip

/**
 * ceci convertit des IP en string
 */
interface IpConverterService {
    /**
     * convertit une IP en string
     * @param ip l'ip à convertir
     * @return
     */
    String getIpAndConvert(Ip ip)
}
