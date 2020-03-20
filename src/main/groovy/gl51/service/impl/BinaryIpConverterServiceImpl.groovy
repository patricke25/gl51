package gl51.service.impl

import gl51.data.Ip

import gl51.service.ipService
import gl51.service.IpConverterService

import javax.inject.Inject


@Singleton
class BinaryConverterServiceImpl implements IpConverterService {
    @Inject ipService service

    @Override
    String getIpAndConvert(Ip ip) {
        ip = service.fetchIp()
        // convertir ip dans str
        String str = ""
        return str
    }

}