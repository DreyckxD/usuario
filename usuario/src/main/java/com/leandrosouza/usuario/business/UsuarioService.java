package com.leandrosouza.usuario.business;

import com.leandrosouza.usuario.business.converter.UsuarioConverter;
import com.leandrosouza.usuario.business.dto.UsuarioDTO;
import com.leandrosouza.usuario.infrastructure.entity.Usuario;
import com.leandrosouza.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        usuarioRepository.save(usuario);
        return usuarioConverter.paraUsuarioDTO(usuario);
    }
}
