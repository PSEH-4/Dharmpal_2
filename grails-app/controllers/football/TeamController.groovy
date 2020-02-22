package football

class TeamController {
    def teamService
    def getAll(){
        render teamService.getAll()
    }
}
