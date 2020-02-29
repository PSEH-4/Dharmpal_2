package football

class CompetitionsController {

    def CompetitionsService
    def getAll(){
        render CompetitionsService.getAll()
    }
}
