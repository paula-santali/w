public class TestAppl {
 
    public static void main(String[] args) {
       
        int max = MemoryService.getMaxAvailableMemory();  
        System.out.println(max);
        
       /* max = MemoryService.getMaxAvailableMemory();
        System.out.println(MemoryService.isAvailable(max+1));
        System.out.println(MemoryService.getMaxAvailableMemory());
        System.out.println(MemoryService.isAvailable(max));
        System.out.println(MemoryService.getMaxAvailableMemory());
        System.out.println(MemoryService.getMaxAvailableMemory());
        System.out.println(MemoryService.getMaxAvailableMemory());*/
 
    }
 
}

