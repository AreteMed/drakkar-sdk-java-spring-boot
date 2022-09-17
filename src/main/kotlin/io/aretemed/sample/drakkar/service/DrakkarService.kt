package io.aretemed.sample.drakkar.service

import io.aretemed.drakkar.client.DrakkarWebClient
import io.aretemed.drakkar.model.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Service

@Service
@ComponentScan("io.aretemed.drakkar")
class DrakkarService {

    @Autowired
    private lateinit var drakkarWebClient: DrakkarWebClient

    fun rooms(limit: Int?, offset : Int?): Rooms? {
        return drakkarWebClient.roomAPI().rooms(limit, offset)
    }

    fun room(roomId : String): Room? {
        return drakkarWebClient.roomAPI().room(roomId)
    }

    fun createRoom(room: Room): CreateRoomStatus {
        return drakkarWebClient.roomAPI().createRoom(room)
    }

    fun updateRoom(room: Room): Room {
        return drakkarWebClient.roomAPI().updateRoom(room)
    }

    fun createMeetingToken(createMeetingTokenInfo: CreateMeetingTokenInfo): CreateMeetingTokenStatus {
        return drakkarWebClient.roomAPI().createMeetingToken(createMeetingTokenInfo)
    }

    fun encounters(limit: Int?, offset : Int?): Encounters? {
        return drakkarWebClient.encounterAPI().encounters(limit, offset)
    }

    fun encounter(encounter : String): Encounter? {
        return drakkarWebClient.encounterAPI().encounter(encounter)
    }
}