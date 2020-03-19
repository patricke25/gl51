package gl51.service.impl

import gl51.data.Ip
import gl51.service.ipService
import gl51.service.IpConverterService

import javax.inject.Inject

class BinaryConverterServiceImpl implements IpConverterService {

    @Inject
    ipService service

    @Override
    String getIpAndConvert(Ip ip) {
        return null
    }
}