
import pt.isel.canvas.*


fun main() {

    onStart {
        val cv : Canvas = Canvas(800, 600, WHITE)
        //cv.drawImage("hero", 0, 0)
        cv.drawImage("hero|0,128,64,64", cv.width/2, cv.height/2)
        var flag = true

        cv.onTimeProgress(500){
            cv.erase()
            flag = !flag
            if(flag){
                cv.drawImage("hero|0,0,64,64", cv.width/2, cv.height/2)
            }else {
                cv.drawImage("hero|0,128,64,64", cv.width / 2, cv.height / 2)
            }
        }

    }
    onFinish {
        print("Finish ")
    }

}