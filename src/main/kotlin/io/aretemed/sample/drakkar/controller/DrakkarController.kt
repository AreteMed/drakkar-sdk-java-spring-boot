package io.aretemed.sample.drakkar.controller
import io.aretemed.drakkar.model.*
import io.aretemed.sample.drakkar.service.DrakkarService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/drakkar/sample")
class DrakkarController(
    val sampleService: DrakkarService
) {

    @GetMapping("/rooms")
    private fun rooms(@RequestParam limit: Int?, @RequestParam offset : Int?): Rooms? {
        return sampleService.rooms(limit, offset)
    }
    @GetMapping("/rooms/{roomId}")
    private fun room(@PathVariable roomId: String): Room? {
        return sampleService.room(roomId)
    }

    @GetMapping("/encounters")
    private fun encounters(@RequestParam limit: Int?, @RequestParam offset : Int?): Encounters? {
        return sampleService.encounters(limit, offset)
    }

    @GetMapping("/encounters/{encounterId}")
    private fun encounter(@PathVariable encounterId: String): Encounter? {
        return sampleService.encounter(encounterId)
    }


    @PostMapping("/rooms/create-room")
    fun createRoom(@RequestBody room : Room): CreateRoomStatus? {
        return sampleService.createRoom(room)
    }

    @PostMapping("/rooms/update-room")
    fun updateRoom(@RequestBody room : Room): Room? {
        return sampleService.updateRoom(room)
    }

    @PostMapping("/rooms/create-meeting-token")
    fun createMeetingToken(@RequestBody createMeetingTokenInfo: CreateMeetingTokenInfo): CreateMeetingTokenStatus? {
        return sampleService.createMeetingToken(createMeetingTokenInfo)
    }

}