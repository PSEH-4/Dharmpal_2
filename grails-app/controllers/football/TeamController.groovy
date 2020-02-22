package football

class TeamController {
    def teamService
    def index() { }
    def getAll(){
        return teamService.getAll()
    }
}
