package action.user;


  
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;





public class UpdateAboutUsAction extends ActionSupport implements ServletContextAware   {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

   private String uploadError;
   
   
   private File doc;   
   private String fileName;   
   private String contentType;   
      
   private ServletContext context;   
          
   public void setDoc(File file) {   
       this.doc = file;   
   }   
      
   public void setDocFileName(String fileName) {   
       this.fileName = fileName;   
   }   
      
   public void setDocContentType(String contentType) {   
       this.contentType = contentType;   
   }   
      
   public void setServletContext(ServletContext context) {   
       this.context = context;   
   }   
   
   
   
    public String getUploadError() {
	return uploadError;
}


public void setUploadError(String uploadError) {
	this.uploadError = uploadError;
}


	public String execute(){  
    	
    	String targetDirectory=context.getRealPath(File.separator+"images"+File.separator+"about_us"+File.separator+"introduction_frame");
    //	String targetFileName=generateFileName(fileName);
    	String targetFileName=fileName;
    	 System.out.println("targetDirectory: "+targetDirectory);
 		System.out.println("targetFileName: "+targetFileName);
 		
        File target=new File(targetDirectory,targetFileName);
        	
       
        System.out.println("targetDirectory:"+targetDirectory);
	
   
 
        try {
			FileUtils.copyFile(doc, target);
			uploadError="success!";
			
		} catch (IOException e) {

			e.printStackTrace();
			uploadError="sorry, the upload failed please try later.";
		
		}// 复制文件  
		return SUCCESS;
			
        	
    }
	private String generateFileName(String fileName){
		DateFormat format= new SimpleDateFormat("yyyyMMdd_HHmmss");
		String formatDate = format.format(new Date());
		int random=new Random().nextInt(10000);
		int position=fileName.lastIndexOf(".");
		String extension=fileName.substring(position);
		return formatDate+random+extension;
	}



   
}  