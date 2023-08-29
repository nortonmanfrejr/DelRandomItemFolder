import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class DeletedArchive{

	public static FolderPath = "";

	private static Random rd = new Random();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args){

		int n = sc.nextInt();
		int randomNumber = rd.nextInt(100);
	
		if (n != randomNumber) 
		{
			File archiveFile = new File(FolderPath);
			System.out.println(archiveFile.exists() == true ? (archiveFile.delete() == true ? Status.Success.getMessage() : Status.Error.getMessage()) : Status.NotFound.getMessage());
		}
	}

}

enum Status{
	Sucess("Archive file delete successfully."),
	Error("Failed to delete the archive file."),
	NotFound("The archive files does not exist.");

	private final String msg;

	Status(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg == null || msg.isEmpty() == true ? "Sem mensagens definidas" : msg;
	}

}