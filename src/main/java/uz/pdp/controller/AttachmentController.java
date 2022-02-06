package uz.pdp.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import uz.pdp.entity.Attachment;
import uz.pdp.payload.Result;
import uz.pdp.repository.AttachmentContentRepository;
import uz.pdp.repository.AttachmentRepository;
import uz.pdp.service.AttachmentService;

@RestController
@RequestMapping(value = "/attachment")
public class AttachmentController {

	@Autowired
	AttachmentService attachmentService;
	
	@PostMapping(value = "/upload")
	public Result upload(MultipartHttpServletRequest request) {
		return attachmentService.uploadFile(request);
	}
	@GetMapping("/info")
	public List<Attachment> getAllAttachment() {
		return attachmentService.getAlResult();
	}
	@GetMapping("info/{id}")
	public Result getAttachment(@PathVariable Integer id) {
		return attachmentService.getAttachment(id);
	}
	@PutMapping("/{id}")
	public Result saveAttachment(@PathVariable Integer id, MultipartHttpServletRequest request) {
		return attachmentService.editAttachment(id, request);
	}
	@GetMapping("/download/{id}")
	public Result getDownloadFile(@PathVariable Integer id, HttpServletResponse response) {
		return attachmentService.downloadFile(id, response);
	}
	@DeleteMapping("/{id}")
	public Result deleteAttachment(@PathVariable Integer id) {
		return attachmentService.deleteAtaResult(id);
	}
		
}
