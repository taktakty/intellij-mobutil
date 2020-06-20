import com.intellij.openapi.project.DumbService
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.*
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory


class MobToolWindowFactory : ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        toolWindow.title = "Mob"
        toolWindow.isAutoHide = true

        DumbService.getInstance(project).runWhenSmart {
            val panel = SimpleToolWindowPanel(true)
            toolWindow.component.add(panel)
        }
    }
}