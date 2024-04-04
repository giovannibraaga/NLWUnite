package rocketseat.com.passin.dto.event;

public record EventDetailDTO(String eventId,
                             String title,
                             String details,
                             String slug,
                             Integer maximumAttendees,
                             Integer attendeesAmount
) {
}
